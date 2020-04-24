package alg;

public class IdWorker {

  final long workerId;
  final static long twepoch = 1288834974657L;
  final static long workerIdBits = 10L;
  final static long maxWorkerId = -1L ^ -1L << workerIdBits;

  final static long sequenceBits = 0xAL;
  final static long sequenceMask = -1L ^ -1L << sequenceBits;

  final static long workerIdShift = sequenceBits;
  final static long timestampLeftShift = sequenceBits + workerIdBits;

  private long lastTimestamp = -1L;
  private long sequence = 0L;

  public IdWorker(final long workerId) {
    if (workerId > maxWorkerId || workerId < 0) {
      throw new IllegalArgumentException(
          String.format("worker Id can't be greater than %d or less than 0", maxWorkerId));
    }
    this.workerId = workerId;
  }

  public synchronized Long nextId() {
    long timestamp = this.timeGen();
    if (this.lastTimestamp == timestamp) {
      // 当前毫秒内，则+1
      this.sequence = (this.sequence + 1) & sequenceMask;
      if (this.sequence == 0) {
        timestamp = this.tilNextMillis(this.lastTimestamp);
      }
    } else {
      this.sequence = 0;
    }
    if (timestamp < this.lastTimestamp) {
      throw new IllegalStateException(
          String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds",
              this.lastTimestamp - timestamp));
    }

    this.lastTimestamp = timestamp;

    return ((lastTimestamp - twepoch << timestampLeftShift)) | (this.workerId << workerIdShift)
        | (this.sequence);
  }

  private long tilNextMillis(final long lastTimestamp) {
    long timestamp = this.timeGen();
    while (timestamp <= lastTimestamp) {
      timestamp = this.timeGen();
    }
    return timestamp;
  }

  private long timeGen() {
    return System.currentTimeMillis();
  }

}
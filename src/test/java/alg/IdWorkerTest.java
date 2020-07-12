package alg;

import static alg.IdWorker.maxWorkerId;
import static alg.IdWorker.sequenceMask;
import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class IdWorkerTest {

  @Test
  public void testNextId() {
    IdWorker idWorker = new IdWorker(0);
    System.out.println("maxWorkerId = " + maxWorkerId);
    System.out.println("sequenceMask = " + sequenceMask);
    System.out.println("Long.toBinaryString(sequenceMask) = " + Long.toBinaryString(sequenceMask));
    for (int i = 0; i < 10; i++) {
      System.out.println("idWorker.nextId() = " + idWorker.nextId());
    }
  }
}
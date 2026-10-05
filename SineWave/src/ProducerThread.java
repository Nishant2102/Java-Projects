public class ProducerThread implements Runnable {
	public double xPoint=0;
	public double angle=0;
	
	
	

	@Override
	public void run() {
		try {
			while(true) {
				synchronized (Program.pointList) {
					while(Program.pointList.getMaxCount()>250) {
						Program.pointList.wait();
					}
					
					
					Program.pointList.add(new Point(xPoint,angle));
					xPoint+=2*(Program.freq);
					angle+=3;
					
					
					if(Program.pointList.getMaxCount()>250) {
						Program.producerActive = false;
						Program.pointList.notifyAll();
					}
					
					
				}
//			Thread.sleep(25);
			}	
		} catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}

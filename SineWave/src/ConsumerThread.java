import utilities.list.LinkedListException;

public class ConsumerThread implements Runnable {

	
	
	@Override
	public void run() {
		try {
			while(true) {
				Point temp;
				synchronized(Program.pointList) {
					while(Program.pointList.getMaxCount()<15) {
						Program.pointList.wait();
					}
					temp = Program.pointList.getFirst(); 
					Program.pointList.delete(0);
					if(Program.pointList.getMaxCount()<15) {
						Program.producerActive = true;
						Program.pointList.notifyAll();
					}
				}
				
				System.out.println(" || x: "+ temp.xPoint +" || y: "+ temp.yPoint+" || angle: " + temp.ANG +" || Size: " + Program.pointList.getMaxCount());
//				Thread.sleep(25);
			}
		} catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (LinkedListException e) {
            e.printStackTrace();
        }
	}

}

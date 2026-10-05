import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import utilities.list.LinkedList;

public class Program {
	
	static LinkedList<Point> pointList= new LinkedList<>();
	static double freq;
	static boolean producerActive = true;

	public static void main(String[] args) {
		
		System.out.println("Enter Frequency value: ");
		Scanner sc = new Scanner(System.in);
		freq=sc.nextDouble();
		
		ExecutorService singleService = Executors.newFixedThreadPool(3);
		
		try {
			
			
			singleService.execute(new ProducerThread());
			singleService.execute(new ConsumerThread());
			
			
			
			
//			ProducerThread producerThread= new ProducerThread();
//			Thread producer= new  Thread (producerThread);
////			producer.setDaemon(true);
//			producer.start();
//			
//			ConsumerThread consumerThread= new ConsumerThread();
//			Thread consumer= new Thread (consumerThread);
////			consumer.setDaemon(true);
//			consumer.start();
			
			Callable<String> call= ()->Thread.currentThread().getName();
			
			Future<String> future = singleService.submit(call);
			
			Thread.sleep(1000);
			try {
				System.out.println(future.get(1,TimeUnit.SECONDS));
			} catch (ExecutionException e) {
				e.printStackTrace();
			} catch (TimeoutException e) {
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			}finally {
				singleService.shutdownNow();
				
				try {
					if(!singleService.awaitTermination(1, TimeUnit.SECONDS)) {
						System.out.println("Forced shutdown complete!");
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					singleService.shutdownNow();
				}
			
			
			
			sc.close();
			System.out.println("Terminated!");
		}
	}
}

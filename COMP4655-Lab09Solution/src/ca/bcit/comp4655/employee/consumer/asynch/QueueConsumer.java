package ca.bcit.comp4655.employee.consumer.asynch;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.NamingException;

import ca.bcit.comp4655.employee.connectionutil.ConnectionElements;
import ca.bcit.comp4655.employee.connectionutil.ConnectionUtil;
import ca.bcit.comp4655.employee.connectionutil.MessagingModelType;
import ca.bcit.comp4655.employee.domain.Employee;

/**
 * Non Durable Msg Consumer 
 * @author Arash Ghavami
 *
 */
public class QueueConsumer
{
	
	public QueueConsumer ( ConnectionElements conElements ) throws NamingException, JMSException
	{
		ConnectionUtil connectionUtil = new ConnectionUtil( conElements );
		connectionUtil.start();
		
		// Receives the messages sent to the destination until the end-of-message-stream control
		while ( true )
		{
			Message m = connectionUtil.getConsumer().receive();
			if ( m != null )
			{
				if ( m instanceof ObjectMessage ) 
				{
					Employee message = ( Employee ) m;
					System.out.println( "Reading Employee: " + message.getFirstName() );
				} 
				else 
				{
					break;
				}
			}
		}
		connectionUtil.disconnect();
	
	}
	
	public static void main( String[] args ) 
	{
		try 
		{
			ConnectionElements connectionElements = new ConnectionElements();
			connectionElements.setDestinationName( "queue/employee" );
			connectionElements.setUrl( "localhost:1099" );
			connectionElements.setSessionMode( Session.AUTO_ACKNOWLEDGE );
			connectionElements.setTransactedSession(false);
			connectionElements.setType( MessagingModelType.QUEUE );
			new QueueConsumer( connectionElements );
		} 
		catch (NamingException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		catch (JMSException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try 
		{
			Thread.sleep(1200000);
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done listening");
	}

}

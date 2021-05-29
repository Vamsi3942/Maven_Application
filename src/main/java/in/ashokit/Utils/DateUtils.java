package in.ashokit.Utils;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class DateUtils 
{
	public DateUtils()
	{
		System.out.println("DateUtils:::Constructor");
		System.out.println("Hi vamsiraju how are you");
	}
	public LocalDate getDate()
	{
		LocalDate now = LocalDate.now();
		return now;
	}
}

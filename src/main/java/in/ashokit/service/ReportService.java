package in.ashokit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Utils.DateUtils;

@Service
public class ReportService 
{
	public ReportService() 
	{
		System.out.println("ReportService:::Constructor");
	}
	@Autowired
	private DateUtils dateUtils;
	
	public void generateReport()
	{
		LocalDate date = dateUtils.getDate();
		System.out.println("Report Generated for::: " +date);
		System.out.println("welcome");
	}
}


package info.fanfou.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * author : chaoluo
 * date : 2015/12/21
 * depiction :
 */
@Service
public class TaskService {

    private Logger logger = LoggerFactory.getLogger(TaskService.class);

    @Resource
    private MailService mailService;

    @Scheduled(cron = "30 15 11 ? * FRI")
    public void sendBill() throws FileNotFoundException, MessagingException {
        logger.info("begin to send email!");
        mailService.sendConfirmedStateBill();
    }

}

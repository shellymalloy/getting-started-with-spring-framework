package sample.spring.chapter07.springbankapp.job;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import sample.spring.chapter07.springbankapp.dao.FixedDepositDao;
import sample.spring.chapter07.springbankapp.domain.FixedDepositDetails;

public class FixedDepositProcessorJob {
	@Autowired
	@Qualifier(value = "fixedDepositDao")
	private FixedDepositDao myFixedDepositDao;

	@Autowired
	private transient JavaMailSender mailSender;

	@Autowired
	@Qualifier("requestProcessedTemplate")
	private transient SimpleMailMessage simpleMailMessage;

	private List<FixedDepositDetails> getInactiveFixedDeposits() {
		return myFixedDepositDao.getInactiveFixedDeposits();
	}

	public void sendEmail() throws AddressException, MessagingException {
		List<FixedDepositDetails> inactiveFds = getInactiveFixedDeposits();
		for (FixedDepositDetails fd : inactiveFds) {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(
					mimeMessage);
			mimeMessageHelper.setTo(fd.getEmail());
			mimeMessageHelper.setSubject(simpleMailMessage.getSubject());
			mimeMessageHelper.setText(simpleMailMessage.getText());
			mailSender.send(mimeMessage);
		}
		myFixedDepositDao.setFixedDepositsAsActive(inactiveFds);
	}
}

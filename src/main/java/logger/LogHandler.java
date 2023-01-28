package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class LogHandler implements SOAPHandler<SOAPMessageContext> {
    private static final Logger LOG = LogManager.getLogger(LogHandler.class);


    @Override
    public Set<QName> getHeaders() {
        return new HashSet<QName>();
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        LOG.info("Handle Message");
        logSoapMessage(context);
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        LOG.info("Handle fault");
        logSoapMessage(context);
        return false;
    }

    @Override
    public void close(MessageContext context) {
        LOG.info("________________close______________");
    }

    private void logSoapMessage(SOAPMessageContext context) {
        Boolean isOutBound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        SOAPMessage soapMsg = context.getMessage();

        try {
            if (isOutBound) {
                LOG.info("Intercepting outbound message:");
            } else {
                LOG.info("Intercepting inbound message:");
            }

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            soapMsg.writeTo(baos);
            LOG.info(baos);

            LOG.info("\n________________________________");

        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

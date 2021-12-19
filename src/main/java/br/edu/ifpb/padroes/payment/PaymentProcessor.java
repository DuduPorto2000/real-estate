package br.edu.ifpb.padroes.payment;

public abstract class PaymentProcessor implements PaymentProcessorHandler {

	 public PaymentProcessorHandler nextProcessor;

	 public void setNextProcessor(PaymentProcessorHandler nextProcessor) {
	        this.nextProcessor = nextProcessor;
	    }

}

package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Apartment;
import br.edu.ifpb.padroes.domain.Bungalow;
import br.edu.ifpb.padroes.domain.Tenement;
import br.edu.ifpb.padroes.payment.PaymentService;
import br.edu.ifpb.padroes.domain.MultiplePayments;


public class Main {
    public static void main(String[] args) {

        Apartment apartment = new Apartment();
        apartment.setAddress("Rua x");
        apartment.setBuilder("Apartamento construtura");
        apartment.setPrice(200000);

        Bungalow bungalow = new Bungalow();
        bungalow.setAddress("Rua y");
        bungalow.setBuilder("BangalÃ´ construtura");
        bungalow.setPrice(150000);

        Tenement tenament = new Tenement();
        bungalow.setAddress("Rua y");
        bungalow.setBuilder("CortiÃ§o construtura");
        bungalow.setPrice(100000);


     // TODO - reduzir chamadas múltiplas para uma única chamada para o método pay() utilizando o padrão composite
     
        MultiplePayments multiplePayments = new MultiplePayments(apartment, bungalow, tenament);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(multiplePayments);
    }
}

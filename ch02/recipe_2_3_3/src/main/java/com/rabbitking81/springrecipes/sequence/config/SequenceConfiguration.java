package com.rabbitking81.springrecipes.sequence.config;

import com.rabbitking81.springrecipes.sequence.DatePrefixGenerator;
import com.rabbitking81.springrecipes.sequence.NumberPrefixGenerator;
import com.rabbitking81.springrecipes.sequence.SequenceGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceConfiguration {
    @Bean
    public DatePrefixGenerator datePrefixGenerator() {
        DatePrefixGenerator datePrefixGenerator = new DatePrefixGenerator();
        datePrefixGenerator.setPattern("yyyyMMdd");

        return datePrefixGenerator;
    }

    @Bean
    public NumberPrefixGenerator numberPrefixGenerator() {
        NumberPrefixGenerator numberPrefixGenerator = new NumberPrefixGenerator();
        return numberPrefixGenerator;
    }

    @Bean
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        sequenceGenerator.setInitial(100000);
        sequenceGenerator.setSuffix("A");
        return sequenceGenerator;
    }

}

package com.example.sample.form;

import jakarta.validation.GroupSequence;

@GroupSequence({ ValidGroup1.class, ValidGroup2.class })
public interface GroupOrder {

}

package com.ffrankowski.rental.domain.apartment;

import javax.persistence.Embeddable;

@Embeddable
class SquareMeter {
    private Double size;

    SquareMeter(final Double size) {
        this.size = size;
    }
}

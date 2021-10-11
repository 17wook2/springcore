package hello.demo.discount;

import hello.demo.member.Grade;
import hello.demo.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10%할인이 적용되어야 한다.")
    void vip_o(){
        //given
        Member memberVIP = new Member(1L, "memberVIP", Grade.VIP);

        //when
        int discount = rateDiscountPolicy.discount(memberVIP, 10000);

        //then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되면 안된다.")
    void vip_x(){
        //given
        Member memberBASIC = new Member(2L, "memberBASIC", Grade.BASIC);

        //when
        int discount = rateDiscountPolicy.discount(memberBASIC, 10000);

        //then
        assertThat(discount).isEqualTo(0);
    }
}
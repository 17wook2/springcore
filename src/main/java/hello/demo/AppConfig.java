package hello.demo;

import hello.demo.discount.DiscountPolicy;
import hello.demo.discount.FixDiscountPolicy;
import hello.demo.member.MemberRepository;
import hello.demo.member.MemberService;
import hello.demo.member.MemberServiceImpl;
import hello.demo.member.MemoryMemberRepository;
import hello.demo.order.OrderService;
import hello.demo.order.OrderServiceImpl;

public class AppConfig {

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    private DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }



}

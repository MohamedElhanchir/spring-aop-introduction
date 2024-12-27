package elhanchir.mohamed.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


@Aspect
public class SecondAspect   {

    @Pointcut("execution(* elhanchir.mohamed.Main.main(..))")
    public void pc1() {}

    /*
    @Before("pc1()")
    public void beforeMain() {
        System.out.println("**********************************");
        System.out.println("Before main");
        System.out.println("**********************************");
    }

    @After("pc1()")
    public void afterMain() {
        System.out.println("**********************************");
        System.out.println("After main");
        System.out.println("**********************************");
    }*/

    @Around("pc1()")
    public void aroundMain(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("**********************************");
        System.out.println("Before main");
        System.out.println("**********************************");

        pjp.proceed();

        System.out.println("**********************************");
        System.out.println("After main");
        System.out.println("***********x***********************");
    }


}

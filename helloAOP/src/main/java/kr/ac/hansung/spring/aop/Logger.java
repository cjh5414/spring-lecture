package kr.ac.hansung.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by jihun on 2018. 11. 18..
 */

@Aspect
public class Logger {
    @Pointcut("execution( void kr.ac.hansung.spring.aop.*.sound())")
    private void selectSound() {}  // signature

    @Before("selectSound()")
    public void aboutToSound() {
        System.out.println("before advice: about to sound() ");
    }

    @After("selectSound()")
    public void afterSound() {
        System.out.println("after advice: after sound() ");
    }
}

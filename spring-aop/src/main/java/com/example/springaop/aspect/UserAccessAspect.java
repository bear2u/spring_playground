package com.example.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class UserAccessAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method calls I would
	//execution(* PACKAGE.*.*(..))
	
//	@Before("execution(* com.example.springaop..*.*(..))")
	@Before("com.example.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void before(JoinPoint joinpoint) {
		logger.info("joinPoint : {}", joinpoint);
	}
	
	@Pointcut("@annotation(com.example.springaop.aspect.TrackTime)")
	public void trackTimeAnnotion() {
		
	}
}
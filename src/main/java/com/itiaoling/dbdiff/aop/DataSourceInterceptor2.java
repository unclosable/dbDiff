package com.itiaoling.dbdiff.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect // for aop
@Component // for auto scan
@Order(0) // execute before @Transactional
public class DataSourceInterceptor2 {
	@Before("@annotation(prodDB)")
	public void before(JoinPoint jp, ProdwDB prodDB) {
		DataSourceTypeManager.set(DataSourceType.prod_w);
	}

	@After("@annotation(prodDB)")
	public void after(JoinPoint jp, ProdwDB prodDB) {
		DataSourceTypeManager.reset();
	}
}

package com.itiaoling.dbdiff.service;

import java.util.Date;

import org.apache.commons.logging.Log;

public interface DiffService {

	void baseinfoDiff(Date actiongtime, Log log);

	void feeinfoDiff(Date actiongtime, Log log);

	void codbaseinfoDiff(Date actiongtime, Log log);

}

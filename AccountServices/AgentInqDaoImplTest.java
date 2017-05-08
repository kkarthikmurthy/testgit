package com.cisco.sbp.services.account.dao;

import java.io.IOException;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import com.cisco.sbp.services.account.pojo.SalesHierarchyDetailResponse;
import com.cisco.sbp.services.framework.exception.BaseException;
import com.cisco.sbp.services.framework.exception.SystemException;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = { AccountAppConfig.class })
//@ActiveProfiles("local")
public class AgentInqDaoImplTest {

	@Autowired
	private AgentInqDAOImpl agentDao;
	
	@Autowired
	AgentInqDAO dao;
	/**
	 * Method to get sales hierarchy for Success Response
	 * @throws IOException
	 * @throws BaseException 
	 */
	//@Test
	public void salesHierarchySuccessTest() throws BaseException{
		String input = "varunsi";
		SalesHierarchyDetailResponse salesHierarchyDetailResponse = agentDao.salesHierarchy(input);
		Assert.assertEquals("SUCCESS", salesHierarchyDetailResponse
				.getResult());





	}
}
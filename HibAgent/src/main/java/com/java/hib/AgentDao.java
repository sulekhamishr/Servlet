package com.java.hib;

import java.util.List;


public class AgentDao {

	List<Agent> showAgentDao();
	Agent searchAgentDao(int AgentId);
	String updateAgentDao(Agent agent );
	String addAgentDao(int agentId);
	String deleteAgentDao(int agentId);

}

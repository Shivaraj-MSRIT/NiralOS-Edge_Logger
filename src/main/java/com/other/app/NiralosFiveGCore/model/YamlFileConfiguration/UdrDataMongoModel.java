package com.other.app.NiralosFiveGCore.model.YamlFileConfiguration;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.other.app.NiralosFiveGCore.Dto.YamlFileConfiguration.AmfYamlDto.SbiData;
import com.other.app.NiralosFiveGCore.Dto.YamlFileConfiguration.ScpYamlDto.NrfSbiDto;
import com.other.app.NiralosFiveGCore.Dto.YamlFileConfiguration.UdryamlDto.SbiDataUdrDto;

@Document
public class UdrDataMongoModel {

	@MongoId
	private String id;
	private String db_uri;
	private SbiData sbi;
	private SbiDataUdrDto udr;
	private NrfSbiDto scp;
	private String parameter;
	private String max;
	private String time;
	private String tenantId;
	private String siteId;
	private String agentId;
	private String nfName;
	public UdrDataMongoModel(String id, String db_uri, SbiData sbi, SbiDataUdrDto udr, NrfSbiDto scp, String parameter,
			String max, String time, String tenantId, String siteId, String agentId, String nfName) {
		super();
		this.id = id;
		this.db_uri = db_uri;
		this.sbi = sbi;
		this.udr = udr;
		this.scp = scp;
		this.parameter = parameter;
		this.max = max;
		this.time = time;
		this.tenantId = tenantId;
		this.siteId = siteId;
		this.agentId = agentId;
		this.nfName = nfName;
	}
	public UdrDataMongoModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDb_uri() {
		return db_uri;
	}
	public void setDb_uri(String db_uri) {
		this.db_uri = db_uri;
	}
	public SbiData getSbi() {
		return sbi;
	}
	public void setSbi(SbiData sbi) {
		this.sbi = sbi;
	}
	public SbiDataUdrDto getUdr() {
		return udr;
	}
	public void setUdr(SbiDataUdrDto udr) {
		this.udr = udr;
	}
	public NrfSbiDto getScp() {
		return scp;
	}
	public void setScp(NrfSbiDto scp) {
		this.scp = scp;
	}
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getNfName() {
		return nfName;
	}
	public void setNfName(String nfName) {
		this.nfName = nfName;
	}
	
	
	

}

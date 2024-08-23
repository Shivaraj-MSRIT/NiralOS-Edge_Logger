package com.other.app.NiralosFiveGCore.Dto.Subscriber.FrontendDto;

import java.util.ArrayList;

import com.other.app.NiralosFiveGCore.Dto.Subscriber.Ambr;
import com.other.app.NiralosFiveGCore.Dto.Subscriber.Security;
import com.other.app.NiralosFiveGCore.Dto.Subscriber.Slice;

public class FilterDto {
	
	String _id;
	Integer schema_version;
	String imsi;
	String deviceType;
	ArrayList<String> msisdn;
	Security security;
	Ambr ambr;
	ArrayList<Slice> slice;
	Integer access_restriction_data;
	Integer subscriber_status;
	Integer network_access_mode;
	Integer subscribed_rau_tau_timer;
	Integer __v;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public Integer getSchema_version() {
		return schema_version;
	}
	public void setSchema_version(Integer schema_version) {
		this.schema_version = schema_version;
	}
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public ArrayList<String> getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(ArrayList<String> msisdn) {
		this.msisdn = msisdn;
	}
	public Security getSecurity() {
		return security;
	}
	public void setSecurity(Security security) {
		this.security = security;
	}
	public Ambr getAmbr() {
		return ambr;
	}
	public void setAmbr(Ambr ambr) {
		this.ambr = ambr;
	}
	public ArrayList<Slice> getSlice() {
		return slice;
	}
	public void setSlice(ArrayList<Slice> slice) {
		this.slice = slice;
	}
	public Integer getAccess_restriction_data() {
		return access_restriction_data;
	}
	public void setAccess_restriction_data(Integer access_restriction_data) {
		this.access_restriction_data = access_restriction_data;
	}
	public Integer getSubscriber_status() {
		return subscriber_status;
	}
	public void setSubscriber_status(Integer subscriber_status) {
		this.subscriber_status = subscriber_status;
	}
	public Integer getNetwork_access_mode() {
		return network_access_mode;
	}
	public void setNetwork_access_mode(Integer network_access_mode) {
		this.network_access_mode = network_access_mode;
	}
	public Integer getSubscribed_rau_tau_timer() {
		return subscribed_rau_tau_timer;
	}
	public void setSubscribed_rau_tau_timer(Integer subscribed_rau_tau_timer) {
		this.subscribed_rau_tau_timer = subscribed_rau_tau_timer;
	}
	public Integer get__v() {
		return __v;
	}
	public void set__v(Integer __v) {
		this.__v = __v;
	}
	public FilterDto(String _id, Integer schema_version, String imsi, String deviceType, ArrayList<String> msisdn,
			Security security, Ambr ambr, ArrayList<Slice> slice, Integer access_restriction_data,
			Integer subscriber_status, Integer network_access_mode, Integer subscribed_rau_tau_timer, Integer __v) {
		super();
		this._id = _id;
		this.schema_version = schema_version;
		this.imsi = imsi;
		this.deviceType = deviceType;
		this.msisdn = msisdn;
		this.security = security;
		this.ambr = ambr;
		this.slice = slice;
		this.access_restriction_data = access_restriction_data;
		this.subscriber_status = subscriber_status;
		this.network_access_mode = network_access_mode;
		this.subscribed_rau_tau_timer = subscribed_rau_tau_timer;
		this.__v = __v;
	}
	public FilterDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

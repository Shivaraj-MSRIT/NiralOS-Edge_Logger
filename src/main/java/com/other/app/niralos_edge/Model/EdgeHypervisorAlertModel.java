package com.other.app.niralos_edge.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="edge_hypervisor_alert_table")
public class EdgeHypervisorAlertModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="alert_id")
	private Long alertId;
	@Column(name="edge_client_id")
	private String edgeClientId;
	@Column(name="alert")
	private String alert;
	@Column(name="type")
	private String type;
	@Column(name="date_time")
	private LocalDateTime date;
	@Column(name="status")
	private Boolean status;
	
	public Long getAlertId() {
		return alertId;
	}
	public void setAlertId(Long alertId) {
		this.alertId = alertId;
	}
	public String getEdgeClientId() {
		return edgeClientId;
	}
	public void setEdgeClientId(String edgeClientId) {
		this.edgeClientId = edgeClientId;
	}
	public String getAlert() {
		return alert;
	}
	public void setAlert(String alert) {
		this.alert = alert;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public EdgeHypervisorAlertModel(String edgeClientId, String alert, String type, LocalDateTime date,
			Boolean status) {
		super();
		this.edgeClientId = edgeClientId;
		this.alert = alert;
		this.type = type;
		this.date = date;
		this.status = status;
	}
	
	public EdgeHypervisorAlertModel() {
		super();
	}
	
	
	
	
	
	
	
	
}

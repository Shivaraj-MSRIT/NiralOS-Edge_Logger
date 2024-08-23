package com.other.app.NiralosFiveGCore.Dto.upgDto;

public class upgErrorDto {
	
	private Long thread;
	private Integer nat44_ed_out2in_slowpath_no_translation;
	private Integer dpdk_input_no_error;
	private Integer ip4_input_Multicast_RPF_check_failed;
	private Integer ip4_local_ip4_source_lookup_miss;
	private Integer ip4_icmp_input_unknown_type;
	private Integer igmp_input_IGMP_not_enabled_on_this_interface;
	private Integer arp_reply_ARP_replies_sent;
	private Integer arp_input_IP4_destination_address_is_unset;
	private Integer upf_ip4_flow_process_packets_with_an_existing_flow;
	private Integer upf_ip4_flow_process_packets_gone_through;
	private Integer upf_ip4_flow_process_packets_which_created_a_new_flow;
	private Integer upf_gtpu4_input_good_packets_decapsulated;
	private Integer upf4_encap_good_packets_encapsulated;
	private Integer session_queue_Packets_transmitted;
	private Integer udp4_input_Packets_enqueued;
	private Integer local0_output_interface_is_down;
	private Integer local0_output_interface_is_deleted;
	private Integer local0_output_no_buffers_to_segment_GSO;
	private int N3_GNB_output_interface_is_down;
	private int N3_GNB_output_interface_is_deleted;
	private int N3_GNB_output_no_buffers_to_segment_GSO;
	private int N3_GNB_tx_DPDK_tx_function_returned_an_error;
	private int N3_GNB_tx_Tx_packet_drops__dpdk_tx_failure;
	private int N4_SMF_output_interface_is_down;
	private int N4_SMF_output_interface_is_deleted;
	private int N4_SMF_output_no_buffers_to_segment_GSO;
	private int N4_SMF_tx_DPDK_tx_function_returned_an_error;
	private int N4_SMF_tx_Tx_packet_drops__dpdk_tx_failure;
	private int N6_DN_output_interface_is_down;
	private int N6_DN_output_interface_is_deleted;
	private int N6_DN_output_no_buffers_to_segment_GSO;
	private int N6_DN_tx_DPDK_tx_function_returned_an_error;
	private int N6_DN_tx_Tx_packet_drops__dpdk_tx_failure;
	private int MEC_output_interface_is_down;
	private int MEC_output_interface_is_deleted;
	private int MEC_output_no_buffers_to_segment_GSO;
	private int MEC_tx_DPDK_tx_function_returned_an_error;
	private int MEC_tx_Tx_packet_drops__dpdk_tx_failure;
	public Long getThread() {
		return thread;
	}
	public void setThread(Long thread) {
		this.thread = thread;
	}
	public Integer getNat44_ed_out2in_slowpath_no_translation() {
		return nat44_ed_out2in_slowpath_no_translation;
	}
	public void setNat44_ed_out2in_slowpath_no_translation(Integer nat44_ed_out2in_slowpath_no_translation) {
		this.nat44_ed_out2in_slowpath_no_translation = nat44_ed_out2in_slowpath_no_translation;
	}
	public Integer getDpdk_input_no_error() {
		return dpdk_input_no_error;
	}
	public void setDpdk_input_no_error(Integer dpdk_input_no_error) {
		this.dpdk_input_no_error = dpdk_input_no_error;
	}
	public Integer getIp4_input_Multicast_RPF_check_failed() {
		return ip4_input_Multicast_RPF_check_failed;
	}
	public void setIp4_input_Multicast_RPF_check_failed(Integer ip4_input_Multicast_RPF_check_failed) {
		this.ip4_input_Multicast_RPF_check_failed = ip4_input_Multicast_RPF_check_failed;
	}
	public Integer getIp4_local_ip4_source_lookup_miss() {
		return ip4_local_ip4_source_lookup_miss;
	}
	public void setIp4_local_ip4_source_lookup_miss(Integer ip4_local_ip4_source_lookup_miss) {
		this.ip4_local_ip4_source_lookup_miss = ip4_local_ip4_source_lookup_miss;
	}
	public Integer getIp4_icmp_input_unknown_type() {
		return ip4_icmp_input_unknown_type;
	}
	public void setIp4_icmp_input_unknown_type(Integer ip4_icmp_input_unknown_type) {
		this.ip4_icmp_input_unknown_type = ip4_icmp_input_unknown_type;
	}
	public Integer getIgmp_input_IGMP_not_enabled_on_this_interface() {
		return igmp_input_IGMP_not_enabled_on_this_interface;
	}
	public void setIgmp_input_IGMP_not_enabled_on_this_interface(Integer igmp_input_IGMP_not_enabled_on_this_interface) {
		this.igmp_input_IGMP_not_enabled_on_this_interface = igmp_input_IGMP_not_enabled_on_this_interface;
	}
	public Integer getArp_reply_ARP_replies_sent() {
		return arp_reply_ARP_replies_sent;
	}
	public void setArp_reply_ARP_replies_sent(Integer arp_reply_ARP_replies_sent) {
		this.arp_reply_ARP_replies_sent = arp_reply_ARP_replies_sent;
	}
	public Integer getArp_input_IP4_destination_address_is_unset() {
		return arp_input_IP4_destination_address_is_unset;
	}
	public void setArp_input_IP4_destination_address_is_unset(Integer arp_input_IP4_destination_address_is_unset) {
		this.arp_input_IP4_destination_address_is_unset = arp_input_IP4_destination_address_is_unset;
	}
	public Integer getUpf_ip4_flow_process_packets_with_an_existing_flow() {
		return upf_ip4_flow_process_packets_with_an_existing_flow;
	}
	public void setUpf_ip4_flow_process_packets_with_an_existing_flow(
			Integer upf_ip4_flow_process_packets_with_an_existing_flow) {
		this.upf_ip4_flow_process_packets_with_an_existing_flow = upf_ip4_flow_process_packets_with_an_existing_flow;
	}
	public Integer getUpf_ip4_flow_process_packets_gone_through() {
		return upf_ip4_flow_process_packets_gone_through;
	}
	public void setUpf_ip4_flow_process_packets_gone_through(Integer upf_ip4_flow_process_packets_gone_through) {
		this.upf_ip4_flow_process_packets_gone_through = upf_ip4_flow_process_packets_gone_through;
	}
	public Integer getUpf_ip4_flow_process_packets_which_created_a_new_flow() {
		return upf_ip4_flow_process_packets_which_created_a_new_flow;
	}
	public void setUpf_ip4_flow_process_packets_which_created_a_new_flow(
			Integer upf_ip4_flow_process_packets_which_created_a_new_flow) {
		this.upf_ip4_flow_process_packets_which_created_a_new_flow = upf_ip4_flow_process_packets_which_created_a_new_flow;
	}
	public Integer getUpf_gtpu4_input_good_packets_decapsulated() {
		return upf_gtpu4_input_good_packets_decapsulated;
	}
	public void setUpf_gtpu4_input_good_packets_decapsulated(Integer upf_gtpu4_input_good_packets_decapsulated) {
		this.upf_gtpu4_input_good_packets_decapsulated = upf_gtpu4_input_good_packets_decapsulated;
	}
	public Integer getUpf4_encap_good_packets_encapsulated() {
		return upf4_encap_good_packets_encapsulated;
	}
	public void setUpf4_encap_good_packets_encapsulated(Integer upf4_encap_good_packets_encapsulated) {
		this.upf4_encap_good_packets_encapsulated = upf4_encap_good_packets_encapsulated;
	}
	public Integer getSession_queue_Packets_transmitted() {
		return session_queue_Packets_transmitted;
	}
	public void setSession_queue_Packets_transmitted(Integer session_queue_Packets_transmitted) {
		this.session_queue_Packets_transmitted = session_queue_Packets_transmitted;
	}
	public Integer getUdp4_input_Packets_enqueued() {
		return udp4_input_Packets_enqueued;
	}
	public void setUdp4_input_Packets_enqueued(Integer udp4_input_Packets_enqueued) {
		this.udp4_input_Packets_enqueued = udp4_input_Packets_enqueued;
	}
	public Integer getLocal0_output_interface_is_down() {
		return local0_output_interface_is_down;
	}
	public void setLocal0_output_interface_is_down(Integer local0_output_interface_is_down) {
		this.local0_output_interface_is_down = local0_output_interface_is_down;
	}
	public Integer getLocal0_output_interface_is_deleted() {
		return local0_output_interface_is_deleted;
	}
	public void setLocal0_output_interface_is_deleted(Integer local0_output_interface_is_deleted) {
		this.local0_output_interface_is_deleted = local0_output_interface_is_deleted;
	}
	public Integer getLocal0_output_no_buffers_to_segment_GSO() {
		return local0_output_no_buffers_to_segment_GSO;
	}
	public void setLocal0_output_no_buffers_to_segment_GSO(Integer local0_output_no_buffers_to_segment_GSO) {
		this.local0_output_no_buffers_to_segment_GSO = local0_output_no_buffers_to_segment_GSO;
	}
	public int getN3_GNB_output_interface_is_down() {
		return N3_GNB_output_interface_is_down;
	}
	public void setN3_GNB_output_interface_is_down(int n3_GNB_output_interface_is_down) {
		N3_GNB_output_interface_is_down = n3_GNB_output_interface_is_down;
	}
	public int getN3_GNB_output_interface_is_deleted() {
		return N3_GNB_output_interface_is_deleted;
	}
	public void setN3_GNB_output_interface_is_deleted(int n3_GNB_output_interface_is_deleted) {
		N3_GNB_output_interface_is_deleted = n3_GNB_output_interface_is_deleted;
	}
	public int getN3_GNB_output_no_buffers_to_segment_GSO() {
		return N3_GNB_output_no_buffers_to_segment_GSO;
	}
	public void setN3_GNB_output_no_buffers_to_segment_GSO(int n3_GNB_output_no_buffers_to_segment_GSO) {
		N3_GNB_output_no_buffers_to_segment_GSO = n3_GNB_output_no_buffers_to_segment_GSO;
	}
	public int getN3_GNB_tx_DPDK_tx_function_returned_an_error() {
		return N3_GNB_tx_DPDK_tx_function_returned_an_error;
	}
	public void setN3_GNB_tx_DPDK_tx_function_returned_an_error(int n3_GNB_tx_DPDK_tx_function_returned_an_error) {
		N3_GNB_tx_DPDK_tx_function_returned_an_error = n3_GNB_tx_DPDK_tx_function_returned_an_error;
	}
	public int getN3_GNB_tx_Tx_packet_drops__dpdk_tx_failure() {
		return N3_GNB_tx_Tx_packet_drops__dpdk_tx_failure;
	}
	public void setN3_GNB_tx_Tx_packet_drops__dpdk_tx_failure(int n3_GNB_tx_Tx_packet_drops__dpdk_tx_failure) {
		N3_GNB_tx_Tx_packet_drops__dpdk_tx_failure = n3_GNB_tx_Tx_packet_drops__dpdk_tx_failure;
	}
	public int getN4_SMF_output_interface_is_down() {
		return N4_SMF_output_interface_is_down;
	}
	public void setN4_SMF_output_interface_is_down(int n4_SMF_output_interface_is_down) {
		N4_SMF_output_interface_is_down = n4_SMF_output_interface_is_down;
	}
	public int getN4_SMF_output_interface_is_deleted() {
		return N4_SMF_output_interface_is_deleted;
	}
	public void setN4_SMF_output_interface_is_deleted(int n4_SMF_output_interface_is_deleted) {
		N4_SMF_output_interface_is_deleted = n4_SMF_output_interface_is_deleted;
	}
	public int getN4_SMF_output_no_buffers_to_segment_GSO() {
		return N4_SMF_output_no_buffers_to_segment_GSO;
	}
	public void setN4_SMF_output_no_buffers_to_segment_GSO(int n4_SMF_output_no_buffers_to_segment_GSO) {
		N4_SMF_output_no_buffers_to_segment_GSO = n4_SMF_output_no_buffers_to_segment_GSO;
	}
	public int getN4_SMF_tx_DPDK_tx_function_returned_an_error() {
		return N4_SMF_tx_DPDK_tx_function_returned_an_error;
	}
	public void setN4_SMF_tx_DPDK_tx_function_returned_an_error(int n4_SMF_tx_DPDK_tx_function_returned_an_error) {
		N4_SMF_tx_DPDK_tx_function_returned_an_error = n4_SMF_tx_DPDK_tx_function_returned_an_error;
	}
	public int getN4_SMF_tx_Tx_packet_drops__dpdk_tx_failure() {
		return N4_SMF_tx_Tx_packet_drops__dpdk_tx_failure;
	}
	public void setN4_SMF_tx_Tx_packet_drops__dpdk_tx_failure(int n4_SMF_tx_Tx_packet_drops__dpdk_tx_failure) {
		N4_SMF_tx_Tx_packet_drops__dpdk_tx_failure = n4_SMF_tx_Tx_packet_drops__dpdk_tx_failure;
	}
	public int getN6_DN_output_interface_is_down() {
		return N6_DN_output_interface_is_down;
	}
	public void setN6_DN_output_interface_is_down(int n6_DN_output_interface_is_down) {
		N6_DN_output_interface_is_down = n6_DN_output_interface_is_down;
	}
	public int getN6_DN_output_interface_is_deleted() {
		return N6_DN_output_interface_is_deleted;
	}
	public void setN6_DN_output_interface_is_deleted(int n6_DN_output_interface_is_deleted) {
		N6_DN_output_interface_is_deleted = n6_DN_output_interface_is_deleted;
	}
	public int getN6_DN_output_no_buffers_to_segment_GSO() {
		return N6_DN_output_no_buffers_to_segment_GSO;
	}
	public void setN6_DN_output_no_buffers_to_segment_GSO(int n6_DN_output_no_buffers_to_segment_GSO) {
		N6_DN_output_no_buffers_to_segment_GSO = n6_DN_output_no_buffers_to_segment_GSO;
	}
	public int getN6_DN_tx_DPDK_tx_function_returned_an_error() {
		return N6_DN_tx_DPDK_tx_function_returned_an_error;
	}
	public void setN6_DN_tx_DPDK_tx_function_returned_an_error(int n6_DN_tx_DPDK_tx_function_returned_an_error) {
		N6_DN_tx_DPDK_tx_function_returned_an_error = n6_DN_tx_DPDK_tx_function_returned_an_error;
	}
	public int getN6_DN_tx_Tx_packet_drops__dpdk_tx_failure() {
		return N6_DN_tx_Tx_packet_drops__dpdk_tx_failure;
	}
	public void setN6_DN_tx_Tx_packet_drops__dpdk_tx_failure(int n6_DN_tx_Tx_packet_drops__dpdk_tx_failure) {
		N6_DN_tx_Tx_packet_drops__dpdk_tx_failure = n6_DN_tx_Tx_packet_drops__dpdk_tx_failure;
	}
	public int getMEC_output_interface_is_down() {
		return MEC_output_interface_is_down;
	}
	public void setMEC_output_interface_is_down(int mEC_output_interface_is_down) {
		MEC_output_interface_is_down = mEC_output_interface_is_down;
	}
	public int getMEC_output_interface_is_deleted() {
		return MEC_output_interface_is_deleted;
	}
	public void setMEC_output_interface_is_deleted(int mEC_output_interface_is_deleted) {
		MEC_output_interface_is_deleted = mEC_output_interface_is_deleted;
	}
	public int getMEC_output_no_buffers_to_segment_GSO() {
		return MEC_output_no_buffers_to_segment_GSO;
	}
	public void setMEC_output_no_buffers_to_segment_GSO(int mEC_output_no_buffers_to_segment_GSO) {
		MEC_output_no_buffers_to_segment_GSO = mEC_output_no_buffers_to_segment_GSO;
	}
	public int getMEC_tx_DPDK_tx_function_returned_an_error() {
		return MEC_tx_DPDK_tx_function_returned_an_error;
	}
	public void setMEC_tx_DPDK_tx_function_returned_an_error(int mEC_tx_DPDK_tx_function_returned_an_error) {
		MEC_tx_DPDK_tx_function_returned_an_error = mEC_tx_DPDK_tx_function_returned_an_error;
	}
	public int getMEC_tx_Tx_packet_drops__dpdk_tx_failure() {
		return MEC_tx_Tx_packet_drops__dpdk_tx_failure;
	}
	public void setMEC_tx_Tx_packet_drops__dpdk_tx_failure(int mEC_tx_Tx_packet_drops__dpdk_tx_failure) {
		MEC_tx_Tx_packet_drops__dpdk_tx_failure = mEC_tx_Tx_packet_drops__dpdk_tx_failure;
	}
	public upgErrorDto(Long thread, Integer nat44_ed_out2in_slowpath_no_translation, Integer dpdk_input_no_error,
			Integer ip4_input_Multicast_RPF_check_failed, Integer ip4_local_ip4_source_lookup_miss,
			Integer ip4_icmp_input_unknown_type, Integer igmp_input_IGMP_not_enabled_on_this_interface,
			Integer arp_reply_ARP_replies_sent, Integer arp_input_IP4_destination_address_is_unset,
			Integer upf_ip4_flow_process_packets_with_an_existing_flow,
			Integer upf_ip4_flow_process_packets_gone_through,
			Integer upf_ip4_flow_process_packets_which_created_a_new_flow,
			Integer upf_gtpu4_input_good_packets_decapsulated, Integer upf4_encap_good_packets_encapsulated,
			Integer session_queue_Packets_transmitted, Integer udp4_input_Packets_enqueued,
			Integer local0_output_interface_is_down, Integer local0_output_interface_is_deleted,
			Integer local0_output_no_buffers_to_segment_GSO, int n3_GNB_output_interface_is_down,
			int n3_GNB_output_interface_is_deleted, int n3_GNB_output_no_buffers_to_segment_GSO,
			int n3_GNB_tx_DPDK_tx_function_returned_an_error, int n3_GNB_tx_Tx_packet_drops__dpdk_tx_failure,
			int n4_SMF_output_interface_is_down, int n4_SMF_output_interface_is_deleted,
			int n4_SMF_output_no_buffers_to_segment_GSO, int n4_SMF_tx_DPDK_tx_function_returned_an_error,
			int n4_SMF_tx_Tx_packet_drops__dpdk_tx_failure, int n6_DN_output_interface_is_down,
			int n6_DN_output_interface_is_deleted, int n6_DN_output_no_buffers_to_segment_GSO,
			int n6_DN_tx_DPDK_tx_function_returned_an_error, int n6_DN_tx_Tx_packet_drops__dpdk_tx_failure,
			int mEC_output_interface_is_down, int mEC_output_interface_is_deleted,
			int mEC_output_no_buffers_to_segment_GSO, int mEC_tx_DPDK_tx_function_returned_an_error,
			int mEC_tx_Tx_packet_drops__dpdk_tx_failure) {
		super();
		this.thread = thread;
		this.nat44_ed_out2in_slowpath_no_translation = nat44_ed_out2in_slowpath_no_translation;
		this.dpdk_input_no_error = dpdk_input_no_error;
		this.ip4_input_Multicast_RPF_check_failed = ip4_input_Multicast_RPF_check_failed;
		this.ip4_local_ip4_source_lookup_miss = ip4_local_ip4_source_lookup_miss;
		this.ip4_icmp_input_unknown_type = ip4_icmp_input_unknown_type;
		this.igmp_input_IGMP_not_enabled_on_this_interface = igmp_input_IGMP_not_enabled_on_this_interface;
		this.arp_reply_ARP_replies_sent = arp_reply_ARP_replies_sent;
		this.arp_input_IP4_destination_address_is_unset = arp_input_IP4_destination_address_is_unset;
		this.upf_ip4_flow_process_packets_with_an_existing_flow = upf_ip4_flow_process_packets_with_an_existing_flow;
		this.upf_ip4_flow_process_packets_gone_through = upf_ip4_flow_process_packets_gone_through;
		this.upf_ip4_flow_process_packets_which_created_a_new_flow = upf_ip4_flow_process_packets_which_created_a_new_flow;
		this.upf_gtpu4_input_good_packets_decapsulated = upf_gtpu4_input_good_packets_decapsulated;
		this.upf4_encap_good_packets_encapsulated = upf4_encap_good_packets_encapsulated;
		this.session_queue_Packets_transmitted = session_queue_Packets_transmitted;
		this.udp4_input_Packets_enqueued = udp4_input_Packets_enqueued;
		this.local0_output_interface_is_down = local0_output_interface_is_down;
		this.local0_output_interface_is_deleted = local0_output_interface_is_deleted;
		this.local0_output_no_buffers_to_segment_GSO = local0_output_no_buffers_to_segment_GSO;
		N3_GNB_output_interface_is_down = n3_GNB_output_interface_is_down;
		N3_GNB_output_interface_is_deleted = n3_GNB_output_interface_is_deleted;
		N3_GNB_output_no_buffers_to_segment_GSO = n3_GNB_output_no_buffers_to_segment_GSO;
		N3_GNB_tx_DPDK_tx_function_returned_an_error = n3_GNB_tx_DPDK_tx_function_returned_an_error;
		N3_GNB_tx_Tx_packet_drops__dpdk_tx_failure = n3_GNB_tx_Tx_packet_drops__dpdk_tx_failure;
		N4_SMF_output_interface_is_down = n4_SMF_output_interface_is_down;
		N4_SMF_output_interface_is_deleted = n4_SMF_output_interface_is_deleted;
		N4_SMF_output_no_buffers_to_segment_GSO = n4_SMF_output_no_buffers_to_segment_GSO;
		N4_SMF_tx_DPDK_tx_function_returned_an_error = n4_SMF_tx_DPDK_tx_function_returned_an_error;
		N4_SMF_tx_Tx_packet_drops__dpdk_tx_failure = n4_SMF_tx_Tx_packet_drops__dpdk_tx_failure;
		N6_DN_output_interface_is_down = n6_DN_output_interface_is_down;
		N6_DN_output_interface_is_deleted = n6_DN_output_interface_is_deleted;
		N6_DN_output_no_buffers_to_segment_GSO = n6_DN_output_no_buffers_to_segment_GSO;
		N6_DN_tx_DPDK_tx_function_returned_an_error = n6_DN_tx_DPDK_tx_function_returned_an_error;
		N6_DN_tx_Tx_packet_drops__dpdk_tx_failure = n6_DN_tx_Tx_packet_drops__dpdk_tx_failure;
		MEC_output_interface_is_down = mEC_output_interface_is_down;
		MEC_output_interface_is_deleted = mEC_output_interface_is_deleted;
		MEC_output_no_buffers_to_segment_GSO = mEC_output_no_buffers_to_segment_GSO;
		MEC_tx_DPDK_tx_function_returned_an_error = mEC_tx_DPDK_tx_function_returned_an_error;
		MEC_tx_Tx_packet_drops__dpdk_tx_failure = mEC_tx_Tx_packet_drops__dpdk_tx_failure;
	}
	public upgErrorDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	
}

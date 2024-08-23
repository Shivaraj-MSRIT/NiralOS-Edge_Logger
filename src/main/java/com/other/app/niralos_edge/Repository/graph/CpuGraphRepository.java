package com.other.app.niralos_edge.Repository.graph;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.other.app.niralos_edge.Model.graph.CpuGraphModel;


public interface CpuGraphRepository extends JpaRepository<CpuGraphModel, Long>{

	//Getting data from database for current desc limit 5 values
		@Query(value="SELECT * FROM (SELECT * FROM edge_cpu_graph m WHERE m.edge_client_id=?1 ORDER BY m.id DESC LIMIT 5) t1 ORDER BY t1.id",nativeQuery = true)
		public List<CpuGraphModel> getGraphValue(String edgeClientId);
		
		@Query("SELECT COUNT(v) FROM CpuGraphModel v")
		public Integer getDataExist();
		
		@Modifying(clearAutomatically = true)
		@Transactional
		@Query(value="DELETE FROM edge_cpu_graph v ORDER BY v.id LIMIT 5",nativeQuery = true)
		public void deleteData();
}

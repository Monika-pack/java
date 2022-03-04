package second_level_cache;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity

@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)

public class EdubridgeAlian {
@Id   //primary key
	
	private int id;
	
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//for select toString method
	@Override
	public String toString() {
		return "EdubridgeAlian [id=" + id + ", name=" + name + "]";
	}
	

}


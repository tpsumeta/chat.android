package org.chat.android;

import java.util.Date;

import android.text.format.Time;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by colin
 */
@DatabaseTable(tableName = "services_accessed")
public class ServiceAccessed {
	@DatabaseField(generatedId = true)
	private int id;
    @DatabaseField
    private int service_id;
    @DatabaseField
    private int visit_id;
    @DatabaseField
	private int client_id;

    /**
     * Default Constructor needed by ormlite
     */
    public ServiceAccessed() {
    }

    /**
     * Constructor that instantiates the private member variable(s)
     * @param service_id
     * @param visit_id
     * @param client_id
     * 
     */
    public ServiceAccessed(int service_id, int visit_id, int client_id) {
    	this.service_id = service_id;
    	this.visit_id = visit_id;
        this.client_id = client_id;
    }
    
    /**
     * Copy constructor
     * @param existingListModel - List model instance that is copied to new instance
     */
    public ServiceAccessed(ServiceAccessed existingServicesAccessedModel) {
        this.service_id = existingServicesAccessedModel.service_id;
        this.visit_id = existingServicesAccessedModel.visit_id;
        this.client_id = existingServicesAccessedModel.client_id;
    }

	public int getId() {
		return id;
	}

	public int getServiceId() {
		return service_id;
	}
	
	public void setServiceId(int service_id) {
		this.service_id = service_id;
	}
	
	public int getVisitId() {
		return visit_id;
	}
	
	public void setVisitId(int visit_id) {
		this.visit_id = visit_id;
	}
	
	public int getClientId() {
		return client_id;
	}
	
	public void setClientId(int client_id) {
		this.client_id = client_id;
	}
}
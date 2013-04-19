/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class Plusones extends GenericJson {

    public String abtk;
    public String aclJson;
    public String id;
    public Boolean isSetByViewer;
    public String kind;
    public Metadata metadata;
    
	public String getAbtk() {
		return abtk;
	}

	public void setAbtk(String abtk) {
		this.abtk = abtk;
	}

	public String getAclJson() {
		return aclJson;
	}

	public void setAclJson(String aclJson) {
		this.aclJson = aclJson;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getIsSetByViewer() {
		return isSetByViewer;
	}

	public void setIsSetByViewer(Boolean isSetByViewer) {
		this.isSetByViewer = isSetByViewer;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public static final class Metadata extends GenericJson
    {

        public Long adgroupId;
        public Long creativeId;
        public GlobalCounts globalCounts;
        public String title;
        public String type;

        public Long getAdgroupId() {
			return adgroupId;
		}

		public void setAdgroupId(Long adgroupId) {
			this.adgroupId = adgroupId;
		}

		public Long getCreativeId() {
			return creativeId;
		}

		public void setCreativeId(Long creativeId) {
			this.creativeId = creativeId;
		}

		public GlobalCounts getGlobalCounts() {
			return globalCounts;
		}

		public void setGlobalCounts(GlobalCounts globalCounts) {
			this.globalCounts = globalCounts;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

        public static final class GlobalCounts extends GenericJson
        {

            public Double count;
            public List person;


            public GlobalCounts()
            {
            }
            
            public static final class Person extends GenericJson
            {

                public String displayName;
                public String id;
                public String profileUrl;
                public String thumbnailUrl;

                public Person()
                {
                }
            }
        }
    }

}

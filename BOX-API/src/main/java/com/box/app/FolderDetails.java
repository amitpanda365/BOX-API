package com.box.app;

public class FolderDetails {

	private String type;
	private String id;
	private String sequence_id;
	private String etag;
	private String name;
	private String created_at;
	private String modified_at;
	private String description;
	private String size;
	private String path_collection;
	private String created_by;
	private String modified_by;
	private String trashed_at;
	private String purged_at;
	private String content_created_at;
	private String content_modified_at;
	private String owned_by;
	private String shared_link;
	private String folder_upload_email;
	private String parent;
	private String item_status;
	private String item_collection;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSequence_id() {
		return sequence_id;
	}

	public void setSequence_id(String sequence_id) {
		this.sequence_id = sequence_id;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getModified_at() {
		return modified_at;
	}

	public void setModified_at(String modified_at) {
		this.modified_at = modified_at;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPath_collection() {
		return path_collection;
	}

	public void setPath_collection(String path_collection) {
		this.path_collection = path_collection;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public String getTrashed_at() {
		return trashed_at;
	}

	public void setTrashed_at(String trashed_at) {
		this.trashed_at = trashed_at;
	}

	public String getPurged_at() {
		return purged_at;
	}

	public void setPurged_at(String purged_at) {
		this.purged_at = purged_at;
	}

	public String getContent_created_at() {
		return content_created_at;
	}

	public void setContent_created_at(String content_created_at) {
		this.content_created_at = content_created_at;
	}

	public String getContent_modified_at() {
		return content_modified_at;
	}

	public void setContent_modified_at(String content_modified_at) {
		this.content_modified_at = content_modified_at;
	}

	public String getOwned_by() {
		return owned_by;
	}

	public void setOwned_by(String owned_by) {
		this.owned_by = owned_by;
	}

	public String getShared_link() {
		return shared_link;
	}

	public void setShared_link(String shared_link) {
		this.shared_link = shared_link;
	}

	public String getFolder_upload_email() {
		return folder_upload_email;
	}

	public void setFolder_upload_email(String folder_upload_email) {
		this.folder_upload_email = folder_upload_email;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getItem_status() {
		return item_status;
	}

	public void setItem_status(String item_status) {
		this.item_status = item_status;
	}

	public String getItem_collection() {
		return item_collection;
	}

	public void setItem_collection(String item_collection) {
		this.item_collection = item_collection;
	}

	@Override
	public String toString() {
		return "FolderDetails [id=" + id + ", name=" + name + "]";
	}

}

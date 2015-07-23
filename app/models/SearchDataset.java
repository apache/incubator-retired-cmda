package models;

public class SearchDataset implements Comparable<SearchDataset> {
	private String data_id;
	private String keyword;
	private String url;
	private String description;
	private String title;

	public String getData_id() {
		return data_id;
	}

	public void setData_id(String data_id) {
		this.data_id = data_id;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getUrl() {
		if (url == null)
			return "http://gcmd.nasa.gov/r/d/" + data_id;

		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		if (title != null)
			return title;
		else
			return data_id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int compareTo(SearchDataset o) {
		return (this.getData_id().compareTo(o.getData_id()));
	}
}

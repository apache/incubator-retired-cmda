package models;

/**
 * Created by raoli on 24-Nov-14.
 */
public class GCMDSearchDataset extends SearchDataset {
	@Override
	public String getUrl(){
		return "http://gcmd.nasa.gov/r/d/"+this.getData_id();
	}

}

package Types;

import com.google.gson.annotations.Expose;

public class tv {
	private static final long serialVersionUID = 100L;
	@Expose (deserialize = false)
	public int genre_ids;
	@Expose (deserialize = true)
	private String original_name;
	@Expose (deserialize = true)
	private String name;
	@Expose (deserialize = true)
	private String first_air_date;
	@Expose (deserialize = true)
	private String backdrop_path;
	@Expose (deserialize = true)
	private String original_language;
	@Expose (deserialize = true)
	private String overview;
	@Expose (deserialize = true)
	private int id;
	@Expose (deserialize = true)
	private int vote_count;
	private float vote_average;
	@Expose (deserialize = true)
	private float popularity;

	public tv() {

	}

	public String getOriginal_name() {
		return original_name;
	}

	public void setOriginal_name(String original_name) {
		this.original_name = original_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirst_air_date() {
		return first_air_date;
	}

	public void setFirst_air_date(String first_air_date) {
		this.first_air_date = first_air_date;
	}

	public String getBackdrop_path() {
		return backdrop_path;
	}

	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}

	public String getOriginal_language() {
		return original_language;
	}

	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVote_count() {
		return vote_count;
	}

	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
	}

	public float getVote_average() {
		return vote_average;
	}

	public void setVote_average(float vote_average) {
		this.vote_average = vote_average;
	}

	public float getPopularity() {
		return popularity;
	}

	public void setPopularity(float popularity) {
		this.popularity = popularity;
	}


}

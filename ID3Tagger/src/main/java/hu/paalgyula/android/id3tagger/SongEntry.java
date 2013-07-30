package hu.paalgyula.android.id3tagger;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by paalgyula on 2013.07.30..
 */
public class SongEntry {
    private String wrapperType = "track";
    private String kind = "song";
    private int artistId = 472328140;
    private int collectionId = 670371076;
    private int trackId = 670371099;
    private String artistName = "Maduk";
    private String collectionName = "Drum & Bass Summer Slammers 2013 (Viper Presents)";
    private String trackName = "Life (feat. Hebe Vrijhof)";
    private String collectionCensoredName = "Drum & Bass Summer Slammers 2013 (Viper Presents)";
    private String trackCensoredName = "Life (feat. Hebe Vrijhof)";
    private String artistViewUrl = "https://itunes.apple.com/us/artist/maduk/id472328140?uo=4";
    private String collectionViewUrl = "https://itunes.apple.com/us/album/life-feat.-hebe-vrijhof/id670371076?i=670371099&uo=4";
    private String trackViewUrl = "https://itunes.apple.com/us/album/life-feat.-hebe-vrijhof/id670371076?i=670371099&uo=4";
    private String previewUrl = "http://a1375.phobos.apple.com/us/r30/Music4/v4/73/d4/b9/73d4b9dd-6620-c037-db8d-fbdc168520d3/mzaf_5285193086937163218.plus.aac.p.m4a";
    private String artworkUrl30 = "http://a1.mzstatic.com/us/r30/Music4/v4/36/db/01/36db013c-0ca4-fe38-64c6-db636160675b/cover.30x30-50.jpg";
    private String artworkUrl60 = "http://a5.mzstatic.com/us/r30/Music4/v4/36/db/01/36db013c-0ca4-fe38-64c6-db636160675b/cover.60x60-50.jpg";
    private String artworkUrl100 = "http://a4.mzstatic.com/us/r30/Music4/v4/36/db/01/36db013c-0ca4-fe38-64c6-db636160675b/cover.100x100-75.jpg";
    private double collectionPrice = 7.99;
    private double trackPrice = 1.29;
    private String releaseDate = "2013-07-21T07:00:00Z";
    private String collectionExplicitness = "notExplicit";
    private String trackExplicitness = "notExplicit";
    private int discCount = 1;
    private int discNumber = 1;
    private int trackCount = 35;
    private int trackNumber = 2;
    private int trackTimeMillis = 288771;
    private String country = "USA";
    private String currency = "USD";
    private String primaryGenreName = "Breakbeat";

    public SongEntry(JSONObject object) throws JSONException {
        this.wrapperType = object.getString("wrapperType");
        this.kind = object.getString("kind");
        this.artistId = object.getInt("artistId");
        this.collectionId = object.getInt("collectionId");
        this.trackId = object.getInt("trackId");
        this.artistName = object.getString("artistName");
        this.collectionName = object.getString("collectionName");
        this.trackName = object.getString("trackName");
        this.collectionCensoredName = object.getString("collectionCensoredName");
        this.trackCensoredName = object.getString("trackCensoredName");
        this.artistViewUrl = object.getString("artistViewUrl");
        this.collectionViewUrl = object.getString("collectionViewUrl");
        this.trackViewUrl = object.getString("trackViewUrl");
        this.previewUrl = object.getString("previewUrl");
        this.artworkUrl30 = object.getString("artworkUrl30");
        this.artworkUrl60 = object.getString("artworkUrl60");
        this.artworkUrl100 = object.getString("artworkUrl100");
        this.collectionPrice = object.getDouble("collectionPrice");
        this.trackPrice = object.getDouble("trackPrice");
        this.releaseDate = object.getString("releaseDate");
        this.collectionExplicitness = object.getString("collectionExplicitness");
        this.trackExplicitness = object.getString("trackExplicitness");
        this.discCount = object.getInt("discCount");
        this.discNumber = object.getInt("discNumber");
        this.trackCount = object.getInt("trackCount");
        this.trackNumber = object.getInt("trackNumber");
        this.trackTimeMillis = object.getInt("trackTimeMillis");
        this.country = object.getString("country");
        this.currency = object.getString("currency");
        this.primaryGenreName = object.getString("primaryGenreName");
    }

    public String getWrapperType() {
        return wrapperType;
    }

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    public String getPreviewU() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getArtworkUrl30() {
        return artworkUrl30;
    }

    public void setArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
    }

    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public double getCollectionPrice() {
        return collectionPrice;
    }

    public void setCollectionPrice(double collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    public double getTrackPrice() {
        return trackPrice;
    }

    public void setTrackPrice(double trackPrice) {
        this.trackPrice = trackPrice;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    public void setTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
    }

    public int getDiscCount() {
        return discCount;
    }

    public void setDiscCount(int discCount) {
        this.discCount = discCount;
    }

    public int getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(int discNumber) {
        this.discNumber = discNumber;
    }

    @Override
    public String toString() {
        return "SongEntry{" +
                "wrapperType='" + wrapperType + '\'' +
                ", kind='" + kind + '\'' +
                ", artistId=" + artistId +
                ", collectionId=" + collectionId +
                ", trackId=" + trackId +
                ", artistName='" + artistName + '\'' +
                ", collectionName='" + collectionName + '\'' +
                ", trackName='" + trackName + '\'' +
                ", collectionCensoredName='" + collectionCensoredName + '\'' +
                ", trackCensoredName='" + trackCensoredName + '\'' +
                ", artistViewUrl='" + artistViewUrl + '\'' +
                ", collectionViewUrl='" + collectionViewUrl + '\'' +
                ", trackViewUrl='" + trackViewUrl + '\'' +
                ", previewUrl='" + previewUrl + '\'' +
                ", artworkUrl30='" + artworkUrl30 + '\'' +
                ", artworkUrl60='" + artworkUrl60 + '\'' +
                ", artworkUrl100='" + artworkUrl100 + '\'' +
                ", collectionPrice=" + collectionPrice +
                ", trackPrice=" + trackPrice +
                ", releaseDate='" + releaseDate + '\'' +
                ", collectionExplicitness='" + collectionExplicitness + '\'' +
                ", trackExplicitness='" + trackExplicitness + '\'' +
                ", discCount=" + discCount +
                ", discNumber=" + discNumber +
                ", trackCount=" + trackCount +
                ", trackNumber=" + trackNumber +
                ", trackTimeMillis=" + trackTimeMillis +
                ", country='" + country + '\'' +
                ", currency='" + currency + '\'' +
                ", primaryGenreName='" + primaryGenreName + '\'' +
                '}';
    }
}

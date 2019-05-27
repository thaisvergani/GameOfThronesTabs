package com.example.gameofthronestabs.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Casa {

    @SerializedName("url")
    private String url;
    @SerializedName("name")
    private String name;
    @SerializedName("region")
    private String region;
    @SerializedName("coatOfArms")
    private String coatOfArms;
    @SerializedName("words")
    private String words;
    @SerializedName("titles")
    private List<String> titles = null;
    @SerializedName("seats")
    private List<String> seats = null;
    @SerializedName("currentLord")
    private String currentLord;
    @SerializedName("heir")
    private String heir;
    @SerializedName("overlord")
    private String overlord;
    @SerializedName("founded")
    private String founded;
    @SerializedName("founder")
    private String founder;
    @SerializedName("diedOut")
    private String diedOut;
    @SerializedName("ancestralWeapons")
    private List<String> ancestralWeapons = null;
    @SerializedName("cadetBranches")
    private List<Object> cadetBranches = null;
    @SerializedName("swornMembers")
    private List<Object> swornMembers = null;


    /**
     * No args constructor for use in serialization
     *
     */
    public Casa() {
    }

    /**
     *
     * @param region
     * @param overlord
     * @param cadetBranches
     * @param heir
     * @param url
     * @param founded
     * @param coatOfArms
     * @param words
     * @param swornMembers
     * @param ancestralWeapons
     * @param name
     * @param diedOut
     * @param titles
     * @param seats
     * @param currentLord
     * @param founder
     */
    public Casa(String url, String name, String region, String coatOfArms, String words, List<String> titles, List<String> seats, String currentLord, String heir, String overlord, String founded, String founder, String diedOut, List<String> ancestralWeapons, List<Object> cadetBranches, List<Object> swornMembers) {
        super();
        this.url = url;
        this.name = name;
        this.region = region;
        this.coatOfArms = coatOfArms;
        this.words = words;
        this.titles = titles;
        this.seats = seats;
        this.currentLord = currentLord;
        this.heir = heir;
        this.overlord = overlord;
        this.founded = founded;
        this.founder = founder;
        this.diedOut = diedOut;
        this.ancestralWeapons = ancestralWeapons;
        this.cadetBranches = cadetBranches;
        this.swornMembers = swornMembers;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCoatOfArms() {
        return coatOfArms;
    }

    public void setCoatOfArms(String coatOfArms) {
        this.coatOfArms = coatOfArms;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    public List<String> getSeats() {
        return seats;
    }

    public void setSeats(List<String> seats) {
        this.seats = seats;
    }

    public String getCurrentLord() {
        return currentLord;
    }

    public void setCurrentLord(String currentLord) {
        this.currentLord = currentLord;
    }

    public String getHeir() {
        return heir;
    }

    public void setHeir(String heir) {
        this.heir = heir;
    }

    public String getOverlord() {
        return overlord;
    }

    public void setOverlord(String overlord) {
        this.overlord = overlord;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getDiedOut() {
        return diedOut;
    }

    public void setDiedOut(String diedOut) {
        this.diedOut = diedOut;
    }

    public List<String> getAncestralWeapons() {
        return ancestralWeapons;
    }

    public void setAncestralWeapons(List<String> ancestralWeapons) {
        this.ancestralWeapons = ancestralWeapons;
    }

    public List<Object> getCadetBranches() {
        return cadetBranches;
    }

    public void setCadetBranches(List<Object> cadetBranches) {
        this.cadetBranches = cadetBranches;
    }

    public List<Object> getSwornMembers() {
        return swornMembers;
    }

    public void setSwornMembers(List<Object> swornMembers) {
        this.swornMembers = swornMembers;
    }

}

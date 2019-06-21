package com.example.picrecstack;

class FeedbackObject {
    private String name;
    private String feedback;
    private String gender;
    private String ageGroup;
    private String websitesUsed;
    private String generatedProfileMatchChoices;
    private String choiceImagesAppeal;
    private String manipulatedPicturesEnjoy;
    private String allowedLikeDislike;
    private String happyWithGeneratedProfile;
    private String attractiveLayout;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getWebsitesUsed() {
        return websitesUsed;
    }

    public void setWebsitesUsed(String websitesUsed) {
        this.websitesUsed = websitesUsed;
    }

    public String getGeneratedProfileMatchChoices() {
        return generatedProfileMatchChoices;
    }

    public void setGeneratedProfileMatchChoices(String generatedProfileMatchChoices) {
        this.generatedProfileMatchChoices = generatedProfileMatchChoices;
    }

    public String getChoiceImagesAppeal() {
        return choiceImagesAppeal;
    }

    public void setChoiceImagesAppeal(String choiceImagesAppeal) {
        this.choiceImagesAppeal = choiceImagesAppeal;
    }

    public String getManipulatedPicturesEnjoy() {
        return manipulatedPicturesEnjoy;
    }

    public void setManipulatedPicturesEnjoy(String manipulatedPicturesEnjoy) {
        this.manipulatedPicturesEnjoy = manipulatedPicturesEnjoy;
    }

    public String getAllowedLikeDislike() {
        return allowedLikeDislike;
    }

    public void setAllowedLikeDislike(String allowedLikeDislike) {
        this.allowedLikeDislike = allowedLikeDislike;
    }

    public String getHappyWithGeneratedProfile() {
        return happyWithGeneratedProfile;
    }

    public void setHappyWithGeneratedProfile(String happyWithGeneratedProfile) {
        this.happyWithGeneratedProfile = happyWithGeneratedProfile;
    }

    public String getAttractiveLayout() {
        return attractiveLayout;
    }

    public void setAttractiveLayout(String attractiveLayout) {
        this.attractiveLayout = attractiveLayout;
    }

    public String getFamiliarWithSystem() {
        return familiarWithSystem;
    }

    public void setFamiliarWithSystem(String familiarWithSystem) {
        this.familiarWithSystem = familiarWithSystem;
    }

    public String getInControl() {
        return inControl;
    }

    public void setInControl(String inControl) {
        this.inControl = inControl;
    }

    public String getUnderstoodProfile() {
        return understoodProfile;
    }

    public void setUnderstoodProfile(String understoodProfile) {
        this.understoodProfile = understoodProfile;
    }

    public String getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(String satisfaction) {
        this.satisfaction = satisfaction;
    }

    public String getUseInTheFuture() {
        return useInTheFuture;
    }

    public void setUseInTheFuture(String useInTheFuture) {
        this.useInTheFuture = useInTheFuture;
    }

    private String familiarWithSystem;
    private String inControl;
    private String understoodProfile;
    private String satisfaction;
    private String useInTheFuture;


    public FeedbackObject(String name, String feedback, String gender, String ageGroup,
                          String generatedProfileMatchChoices, String choiceImagesAppeal, String manipulatedPicturesEnjoy,
                          String allowedLikeDislike, String happyWithGeneratedProfile, String attractiveLayout,
                          String familiarWithSystem, String inControl, String understoodProfile,
                          String satisfaction, String useInTheFuture) {
        this.name = name;
        this.feedback = feedback;
        this.gender = gender;
        this.ageGroup = ageGroup;
        this.websitesUsed = websitesUsed;
        this.generatedProfileMatchChoices = generatedProfileMatchChoices;
        this.choiceImagesAppeal = choiceImagesAppeal;
        this.manipulatedPicturesEnjoy = manipulatedPicturesEnjoy;
        this.allowedLikeDislike = allowedLikeDislike;
        this.happyWithGeneratedProfile = happyWithGeneratedProfile;
        this.attractiveLayout = attractiveLayout;
        this.familiarWithSystem = familiarWithSystem;
        this.inControl = inControl;
        this.understoodProfile = understoodProfile;
        this.satisfaction = satisfaction;
        this.useInTheFuture = useInTheFuture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}



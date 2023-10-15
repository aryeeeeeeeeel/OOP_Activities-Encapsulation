class Students {
    private String name, section, motto;
    
    
    protected Students(String name, String section, String motto) {
        this.name = name;
        this.section = section;
        this.motto = motto;
    }  
    final String getName(){
    return name;
}
    private void setName(String newName){
        name = newName;
    }
    final String getSection(){
    return section;
}
    private void setSection(String newSection){
        section = newSection;
    }
    final String getMotto(){
    return motto;
    }
    private void setMotto(String newMotto){
        motto = newMotto;
    }
}

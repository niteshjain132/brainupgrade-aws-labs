package com.brainupgrade.aws.serverless.lambda.model;

public class Language {
  private String name;

  public Language(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
}
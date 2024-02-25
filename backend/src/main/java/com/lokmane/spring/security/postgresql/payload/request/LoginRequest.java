package com.lokmane.spring.security.postgresql.payload.request;

import jakarta.validation.constraints.NotBlank;

public class LoginRequest {
  // @NotBlank(message = "The username/email should not be empty")
  // private String usernameOrEmail;

  @NotBlank(message = "the password should not be emtpy")
  private String password;

    @NotBlank(message = "the username should not be emtpy")
  private String username;

    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
      this.username = username;
    }

  // public String getUsernameOrEmail() {
  //   return usernameOrEmail;
  // }


  // public void setUsernameOrEmail(String usernameOrEmail) {
  //     this.usernameOrEmail = usernameOrEmail;
  //   }



  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}

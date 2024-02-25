package com.lokmane.spring.security.postgresql.payload.request;

import java.util.Set;

import jakarta.validation.constraints.*;

public class SignupRequest {
  @NotBlank(message = "Username is required")
  @Size(min = 3, max = 20 , message = "Username must be between 3 and 20 characters")
  private String username;

  @NotBlank(message = "email is required")
  @Size(max = 50,message = "Too Long Email")
  @Email(message = "Invalid Format of Email")
  private String email;

  private Set<String> role;

  @NotBlank(message = "password should not be empty")
  @Size(min = 6, max = 40, message = "password must be between 6 and 40 characters")
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<String> getRole() {
    return this.role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }
}

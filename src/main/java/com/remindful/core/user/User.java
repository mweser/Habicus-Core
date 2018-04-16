package com.remindful.core.user;

public interface User {
  boolean updateEmail(String email);
  boolean updatePassword(String password);
  boolean updateAddress(String address);
}

class Auth {
  public boolean isLogin(User user, String username, String password) {
    return user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password) ? true : false;
  }

  public void logout(User user) {
    user.setUsername(null);
    user.setPassword(null);
  }
}

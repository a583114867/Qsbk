package com.zzq.qsbk.bean;

/**
 * Created by 朱志强 on 2017/4/21.
 */

public class User {
        /**
         * avatar_updated_at : 1489409732
         * medium : //pic.qiushibaike.com/system/avtnew/3353/33535869/medium/2017031320553196.JPEG
         * thumb : //pic.qiushibaike.com/system/avtnew/3353/33535869/thumb/2017031320553196.JPEG
         * last_visited_at : 0
         * created_at : 1489409731
         * updated_at : 1489409731
         * state : active
         * role : n
         * login : 左右眠
         * last_device :
         * id : 33535869
         * icon : 2017031320553196.JPEG
         */

        private int avatar_updated_at;
        private String medium;
        private String thumb;
        private int last_visited_at;
        private int created_at;
        private int updated_at;
        private String state;
        private String role;
        private String login;
        private String last_device;
        private int id;
        private String icon;

        public void setAvatar_updated_at(int avatar_updated_at) {
            this.avatar_updated_at = avatar_updated_at;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public void setLast_visited_at(int last_visited_at) {
            this.last_visited_at = last_visited_at;
        }

        public void setCreated_at(int created_at) {
            this.created_at = created_at;
        }

        public void setUpdated_at(int updated_at) {
            this.updated_at = updated_at;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public void setLast_device(String last_device) {
            this.last_device = last_device;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getAvatar_updated_at() {
            return avatar_updated_at;
        }

        public String getMedium() {
            return medium;
        }

        public String getThumb() {
            return thumb;
        }

        public int getLast_visited_at() {
            return last_visited_at;
        }

        public int getCreated_at() {
            return created_at;
        }

        public int getUpdated_at() {
            return updated_at;
        }

        public String getState() {
            return state;
        }

        public String getRole() {
            return role;
        }

        public String getLogin() {
            return login;
        }

        public String getLast_device() {
            return last_device;
        }

        public int getId() {
            return id;
        }

        public String getIcon() {
            return icon;
        }

    @Override
    public String toString() {
        return "User{" +
                "avatar_updated_at=" + avatar_updated_at +
                ", medium='" + medium + '\'' +
                ", thumb='" + thumb + '\'' +
                ", last_visited_at=" + last_visited_at +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", state='" + state + '\'' +
                ", role='" + role + '\'' +
                ", login='" + login + '\'' +
                ", last_device='" + last_device + '\'' +
                ", id=" + id +
                ", icon='" + icon + '\'' +
                '}';
    }
}
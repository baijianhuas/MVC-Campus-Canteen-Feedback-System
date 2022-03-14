package campus.canteen.enums;

public enum UserPictureCategoryEnum {
    BLOG_CATEGORY_ICON(1),

    /**
     * 博主头像
     */
    BLOGGER_AVATAR(2);

    private int code;

    UserPictureCategoryEnum(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}

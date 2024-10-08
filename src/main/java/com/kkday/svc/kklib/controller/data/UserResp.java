package com.kkday.svc.kklib.controller.data;

import com.kkday.sdk.controller.ResponseJson;

import com.kkday.svc.kklib.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserResp extends ResponseJson<User> {
    private User user;
}

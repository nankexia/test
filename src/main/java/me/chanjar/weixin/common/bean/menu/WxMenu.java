package me.chanjar.weixin.common.bean.menu;

import me.chanjar.weixin.common.util.ToStringUtils;
import me.chanjar.weixin.common.util.json.WxGsonBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * 鑿滃崟锛堝叕浼楀彿鍜屼紒涓氬彿鍏辩敤鐨勶級
 *
 * @author Daniel Qian
 */
public class WxMenu implements Serializable {

  private static final long serialVersionUID = -7083914585539687746L;

  private List<WxMenuButton> buttons = new ArrayList<WxMenuButton>();

  private WxMenuRule matchRule;

  /**
   * 瑕佺敤 http://mp.weixin.qq.com/wiki/16/ff9b7b85220e1396ffa16794a9d95adc.html 鏍煎紡鏉ュ弽搴忓垪鍖�
   * 鐩告瘮 http://mp.weixin.qq.com/wiki/13/43de8269be54a0a6f64413e4dfa94f39.html 鐨勬牸寮忥紝澶栧眰澶氬浜嗕竴涓猰enu
   */
  public static WxMenu fromJson(String json) {
    return WxGsonBuilder.create().fromJson(json, WxMenu.class);
  }

  /**
   * 瑕佺敤 http://mp.weixin.qq.com/wiki/16/ff9b7b85220e1396ffa16794a9d95adc.html 鏍煎紡鏉ュ弽搴忓垪鍖�
   * 鐩告瘮 http://mp.weixin.qq.com/wiki/13/43de8269be54a0a6f64413e4dfa94f39.html 鐨勬牸寮忥紝澶栧眰澶氬浜嗕竴涓猰enu
   */
  public static WxMenu fromJson(InputStream is) {
    return WxGsonBuilder.create().fromJson(new InputStreamReader(is, StandardCharsets.UTF_8), WxMenu.class);
  }

  public List<WxMenuButton> getButtons() {
    return this.buttons;
  }

  public void setButtons(List<WxMenuButton> buttons) {
    this.buttons = buttons;
  }

  public WxMenuRule getMatchRule() {
    return this.matchRule;
  }

  public void setMatchRule(WxMenuRule matchRule) {
    this.matchRule = matchRule;
  }

  public String toJson() {
    return WxGsonBuilder.create().toJson(this);
  }

  @Override
  public String toString() {
    return ToStringUtils.toSimpleString(this);
  }

}

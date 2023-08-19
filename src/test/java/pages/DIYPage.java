package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class DIYPage {
	WebDriver driver;

	@FindBy(css = ".section-heading__text--6fd88.section-heading__text--plain--6fd88")
	public WebElement DIYpagevisit;

	//@FindBy(css = "img[alt='How to Prep a Deck for Staining']")
	@FindBy(css = ".etchStory__container [data-module-content-id='EtchStoryCard_thd_bf5f']:nth-of-type(1) [height]")
	public WebElement clickvideo;

	@FindBy(css = "img[alt='Close']")
	public WebElement cancelvideo;

	@FindBy(css = "div:nth-of-type(3) > .customNav__container > ul > li:nth-of-type(2) > a")
	public WebElement clickwoodlink;

	@FindBy(css = ".articles-title__heading")
	public WebElement woodassert;

	@FindBy(css = "input#ab")
	public WebElement buyingguidescheckbox;

	@FindBy(css = ".pill--12gxt > .pill-text--12gxt")
	public WebElement buyingguidescheckboxmessage;
	
	@FindBy(css = "[value='ip48']")
	public WebElement backyardcheckbox;

	@FindBy(css = ".pill--12gxt > .pill-text--12gxt")
	public WebElement backyardcheckboxmessage;

	public DIYPage() {
		driver = BrowserHelper.driver;
		PageFactory.initElements(driver, this);
	}

	public void loadDIYPage() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL != "https://www.homedepot.com/c/diy_projects_and_ideas") {
			driver.get("https://www.homedepot.com/c/diy_projects_and_ideas");
		}
	}

	public void loadDIYWoodsPage() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL != "https://www.homedepot.com/c/alp/craft-ideas-diy-wood-projects/1cd8-22sx") {
			driver.get("https://www.homedepot.com/c/alp/craft-ideas-diy-wood-projects/1cd8-22sx");
		}

	}
}

package controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HomePageControllerTest {
    private HomePageController homePageController;

    @Before
    public void setup() {
        homePageController = new HomePageController();
    }

    @Test
    public void testRenderPage() {
        Assert.assertNotNull(homePageController.renderPage());
    }
}

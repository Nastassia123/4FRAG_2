package tests;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;


public class VerifyHeaderButtonsAreClickable extends MainPage {

    @Parameters({"Вход/регистрация"})
    @Test
    public void testLoginWindowIsDisplayed(String tab) {
        LoginPage loginPage = new MainPage()
                .openHomePage()
                .openLoginPage(tab);
        Assert.assertTrue(loginPage.isLoginPageHeaderDisplayed());
    }

    @Parameters({"Доставка"})
    @Test
    public void testDeliveryPageIsDisplayed(String tab) {

        DeliveryPage deliveryPage = new MainPage()
                .openHomePage()
                .openDeliveryPage(tab);
        Assert.assertTrue(deliveryPage.isDeliveryPageHeaderDisplayed());
    }

    @Parameters({"Корзина"})
    @Test
    public void testBasketPageIsDisplayed(String tab) {

        BasketPage basketPage = new MainPage()
                .openHomePage()
                .openBasketPage(tab);
        Assert.assertTrue(basketPage.isBasketPageHeaderDisplayed());
    }


    @Parameters({"Сравнение товаров"})
    @Test
    public void testComparasionListPageIsDisplayed(String tab) {

        ComparasionListPage comparasionListPage = new MainPage()
                .openHomePage()
                .openComparasionListPage(tab);
        Assert.assertTrue(comparasionListPage.isComparasionListPageHeaderDisplayed());
    }


    @Parameters({"Гарантия"})
    @Test
    public void testWarrantyPageIsDisplayed(String tab) {

        WarrantyPage warrantyPage = new MainPage()
                .openHomePage()
                .openWarrantyPage(tab);
        Assert.assertTrue(warrantyPage.isWarrantyPageHeaderDisplayed());
    }


    @Parameters({"Оплата"})
    @Test
    public void testPaymentPageIsDisplayed(String tab) {
        PaymentPage paymentPage = new MainPage()
                .openHomePage()
                .openPaymentPage(tab);
        Assert.assertTrue(paymentPage.isPaymentPageHeaderDisplayed());

    }


    @Parameters({"Закладки"})
    @Test
    public void testWishListPageIsDisplayed(String tab) {
        WishListPage wishListPage = new MainPage()
                .openHomePage()
                .openProductInTheWishListPage(tab);
        Assert.assertTrue(wishListPage.isWishListPageHeaderDisplayed());

    }

    @Parameters({"Система скидок"})
    @Test
    public void testDiscountSystemPageIsDisplayed(String tab) {
        DiscountSystemPage discountSystemPage = new MainPage()
                .openHomePage()
                .openDiscountSystemPage(tab);
        Assert.assertTrue(discountSystemPage.isDiscountSystemPageHeaderDisplayed());

    }

    @Parameters({"Закладки"})
    @Test
    public void testBookmarksPageIsDisplayed(String tab) {
       BookmarksPage bookmarksPage = new MainPage()
                .openHomePage()
                .openBookmarksPage(tab);
        Assert.assertTrue(bookmarksPage.isBookmarksPageHeaderDisplayed());

    }
}







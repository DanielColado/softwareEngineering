// @ts-check
const { test, expect } = require('@playwright/test');

test('has title', async ({ page }) => {
    await page.goto('http://localhost:3000/');

    // Expect a title "to contain" a substring.
    await expect(page).toHaveTitle(/React/);
});

test('get uah img', async ({ page }) => {
    await page.goto('http://localhost:3000/');
    // Expect "to contain" an img.
    await page.getByRole('img', { name: 'uahlogo' });
});


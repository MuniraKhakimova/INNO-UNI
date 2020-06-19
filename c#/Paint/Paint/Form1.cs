using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Paint
{
    enum Tool
    {
        Pencil,
        Line,
        Rectangle,
        Ellipse,
        Fill,
        Star,
        Erase
    }

    public partial class Form1 : Form
    {
        Bitmap bitmap;
        Graphics graphics;
        Point firstPoint;
        Point secondPoint;
        Pen pen = new Pen(Color.Red, 10);
        Tool activeTool = Tool.Pencil;
        public Form1()
        {
            InitializeComponent();
            bitmap = new Bitmap(pictureBox1.Width, pictureBox1.Height);
            graphics = Graphics.FromImage(bitmap);
            graphics.Clear(Color.White);
            pictureBox1.Image = bitmap;
            pen.StartCap = System.Drawing.Drawing2D.LineCap.Round;
            pen.EndCap = System.Drawing.Drawing2D.LineCap.Round;
        }

        private void PictureBox1_MouseDown(object sender, MouseEventArgs e)
        {
            firstPoint = e.Location;
            if (activeTool == Tool.Fill)
            {
                DummyFill dummyFill = new DummyFill();
                dummyFill.Fill(bitmap, e.Location, pen.Color);
            }
            
        }

        private void PictureBox1_MouseMove(object sender, MouseEventArgs e)
        {
            if (e.Button == MouseButtons.Left)
            {
                secondPoint = e.Location;
                switch (activeTool)
                {
                    case Tool.Pencil:
                        graphics.DrawLine(pen, firstPoint, secondPoint);
                        firstPoint = secondPoint;
                        break;
                    case Tool.Line:
                        break;
                    case Tool.Rectangle:
                        break;
                    case Tool.Ellipse:
                        break;
                    case Tool.Fill:
                        break;
                    case Tool.Star:
                        break;
                    case Tool.Erase:
                        break;
                    default:
                        break;
                }
                pictureBox1.Refresh();

            }

        }

        private void PencilBtn_Click(object sender, EventArgs e)
        {
            activeTool = Tool.Pencil;
        }

        private void LineBtn_Click(object sender, EventArgs e)
        {
            activeTool = Tool.Line;
        }

        private void RectangleBtn_Click(object sender, EventArgs e)
        {
            activeTool = Tool.Rectangle;
        }

        private void EllipseBtn_Click(object sender, EventArgs e)
        {
            activeTool = Tool.Ellipse;
        }

        private void FillBtn_Click(object sender, EventArgs e)
        {
            activeTool = Tool.Fill;
        }

        private void StarBtn_Click(object sender, EventArgs e)
        {
            activeTool = Tool.Star;
        }

        private void EraseBtn_Click(object sender, EventArgs e)
        {
            activeTool = Tool.Erase;
        }

        private void PictureBox1_MouseUp(object sender, MouseEventArgs e)
        {
            switch (activeTool)
            {
                case Tool.Line:
                    graphics.DrawLine(pen, firstPoint, secondPoint);
                    break;
                case Tool.Pencil:
                    graphics.DrawLine(pen, firstPoint, secondPoint);
                    firstPoint = secondPoint;
                    break;
                case Tool.Rectangle:
                    graphics.DrawRectangle(pen, GetRectangle(firstPoint, secondPoint));
                    break;
                case Tool.Ellipse:
                    graphics.DrawEllipse(pen, GetRectangle(firstPoint, secondPoint));
                    break;
                case Tool.Fill:
                    break;
                default:
                    break;
            }
        }

        private void PictureBox1_Paint(object sender, PaintEventArgs e)
        {
            switch (activeTool)
            {
                case Tool.Pencil:
                    break;
                case Tool.Line:
                    e.Graphics.DrawLine(pen, firstPoint, secondPoint);
                    break;
                case Tool.Rectangle:
                    e.Graphics.DrawRectangle(pen, GetRectangle(firstPoint, secondPoint));
                    break;
                case Tool.Ellipse:
                    e.Graphics.DrawEllipse(pen, GetRectangle(firstPoint, secondPoint));
                    break;
                case Tool.Fill:
                    break;
                default:
                    break;
            }
        }

        Rectangle GetRectangle(Point p1, Point p2)
        {
            Rectangle res = new Rectangle();
            res.X = Math.Min(p1.X, p2.X);
            res.Y = Math.Min(p1.Y, p2.Y);
            res.Width = Math.Abs(p1.X - p2.X);
            res.Height = Math.Abs(p1.Y - p2.Y);
            return res;
        }

        

        private void FromColorDialogToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (colorDialog1.ShowDialog() == DialogResult.OK)
            {
                pen.Color = colorDialog1.Color;
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void ToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            if (colorDialog1.ShowDialog() == DialogResult.OK)
            {
                pen.Color = colorDialog1.Color;
            }
        }
    }
}